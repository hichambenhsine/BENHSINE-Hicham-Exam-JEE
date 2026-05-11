import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Client, Contrat } from '../model/assurance.models';


@Injectable({
  providedIn: 'root',
})
export class AssuranceService {
  private host = 'http://localhost:8080/api';

  constructor(private http: HttpClient) {}

  public getClients(): Observable<Array<Client>> {
    return this.http.get<Array<Client>>(`${this.host}/clients`);
  }

  public getContrats(): Observable<Array<Contrat>> {
    return this.http.get<Array<Contrat>>(`${this.host}/contrats`);
  }

  public saveClient(client: Client): Observable<Client> {
    return this.http.post<Client>(`${this.host}/clients`, client);
  }
}
