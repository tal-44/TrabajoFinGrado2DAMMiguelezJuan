import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Category } from '../common/category';
import { Observable } from 'rxjs';
import { HeaderService } from './header.service';

@Injectable({
  providedIn: 'root'
})
export class CategoryService {

  private apiurl: string = 'http://localhost:8085/api/v1/admin/categories'

  constructor(private http:HttpClient, private headerService:HeaderService) { }

  getCategoryList():Observable<Category[]>{
    return this.http.get<Category[]>(this.apiurl, { headers: this.headerService.headers });
  }

  createCategory(category:Category):Observable<Category> {
    return this.http.post<Category>(this.apiurl, category, { headers: this.headerService.headers });
  }

  deleteCategoryById(id:number):Observable<any>{
    return this.http.delete(`${this.apiurl}/${id}`, { headers: this.headerService.headers });    
  }

  getCategoryById(id:number):Observable<Category> {
    return this.http.get<Category>(`${this.apiurl}/${id}`, { headers: this.headerService.headers });
  }

}
