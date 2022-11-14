import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class OcupacionesService {

  private API_SERVER = "http://localhost:8083/ocupacion";

  constructor(
    private httpClient: HttpClient,

  ) { }



    public listarOcupacion(): Observable<any>{
      return this.httpClient.get(this.API_SERVER);
    }
}
