import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UsuariosService {
  
  private API_SERVER = "http://localhost:8083/usuario/";

  constructor(private httpClient:HttpClient) { }



  public listarUsuario(): Observable<any>{
    return this.httpClient.get(this.API_SERVER);
  }

  public guardarUsuario (usuario:any) : Observable<any>{
    return this.httpClient.post(this.API_SERVER,usuario);
  }
  

  public eliminarUsuario(numero_identidad):Observable<any>{
    return this.httpClient.delete(this.API_SERVER +"delete/"+numero_identidad);
  }


}
