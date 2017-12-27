import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { Headers, Http, RequestOptions } from '@angular/http';
import { Utils } from './../../entity/Utils';
import { User } from './../../entity/User';
import 'rxjs/add/operator/map';

/*
  Generated class for the LoginServiceProvider provider.

  See https://angular.io/guide/dependency-injection for more info on providers
  and Angular DI.
*/
@Injectable()
export class LoginServiceProvider {

  private loginUrl: string;
  public handleError: any;

  constructor(public http: HttpClient) {
    this.loginUrl = Utils.getUrlBackend() + "oauth/token?grant_type=password&username="
  }

  public login(user: User): Observable<any> {

    this.loginUrl + user.email + "&password=" + encodeURIComponent(user.password);

    let headers = new Headers({


      "Authorization": "Basic " + btoa("cliente" + ':' + "123")

    });

    let options = new RequestOptions({headers: headers});

    return this.http.post(this.loginUrl, {}, options).map(res => res.json());

  }

}
