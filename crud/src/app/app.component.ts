import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import {FormGroup} from '@angular/forms'
import {UsuariosService} from './Services/usuarios/usuarios.service';
import {OcupacionesService} from './Services/ocupaciones/ocupaciones.service';
import {CiudadesService} from './Services/ciudades/ciudades.service';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  displayedColumns: string[] = ['numero_identidad', 'nombre', 'apellido', 'fecha_nacimiento', 'id_ciudad_fk', 'correo_electronico','telefono','id_ocupacion_fk'];  

  messageInfo: String;
  mostrarAlerta: boolean;
  usuarioForm: FormGroup;
  ocupaciones: any;
  ciudades: any;
  usuarios: any;

  constructor(
    public fb: FormBuilder,
    public usuariosService: UsuariosService,
    public ocupacionesService: OcupacionesService,
    public ciudadesService: CiudadesService
  ){
   
  }
  ngOnInit(): void {

    this.usuarioForm = this.fb.group({
      numero_identidad:['',Validators.required],
      nombre:['',Validators.required],
      apellido:['',Validators.required ],
      fecha_nacimiento : [Date ,Validators.required],
      id_ciudad_fk : ['', Validators.required],
      correo_electronico : ['',Validators.required ],
      telefono : ['',Validators.required],
      id_ocupacion_fk : ['' ,Validators.required],
    });;

    this.ocupacionesService.listarOcupacion().subscribe(resp=>{

      this.ocupaciones = resp;
      console.log(resp);

    },
    error => {console.error(error)}
  
    );

    this.ciudadesService.listarCiudad().subscribe(resp=>{

      this.ciudades = resp;
      console.log(resp);
    },
    
    error => {console.error(error)}

    );

    this.usuariosService.listarUsuario().subscribe(resp=>{
      this.usuarios = resp;
    },
      error =>{console.error(error)}    
    );


  };

  guardar():void{
    this.usuariosService.guardarUsuario(this.usuarioForm.value).subscribe(resp=>{
      this.usuarioForm.reset();
      this.usuarios=this.usuarios.filter(usuarios=> resp.numero_identidad!.numero_identidad)
      this.usuarios.push(resp);
      this.usuarios.reset();

    },
    error => {console.error(error) }
    )
  }

  eliminar(usuario){
    this.usuariosService.eliminarUsuario(usuario.numero_identidad).subscribe(resp=>{
      if(resp===true){
        this.usuarios.pop(usuario)
      }
    })
  }

  editar(usuario){
    this.usuarioForm.setValue({
      numero_identidad: usuario.numero_identidad,
      nombre: usuario.nombre,
      apellido: usuario.apellido,
      fecha_nacimiento :  usuario.fecha_nacimiento,
      id_ciudad_fk: usuario.id_ciudad_fk.nombre_ciudad,
      correo_electronico : usuario.correo_electronico,
      telefono : usuario.telefono, 
      id_ocupacion_fk : usuario.id_ocupacion_fk.nombre_ocupacion,
    })
  }
}


