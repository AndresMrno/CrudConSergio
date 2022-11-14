import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CiudadesService {

  private API_SERVER = "http://localhost:8083/ciudad";

  constructor(
    private httpClient: HttpClient,

  ) { }


public listarCiudad(): Observable<any>{
  return this.httpClient.get(this.API_SERVER);
}

}
