import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-headerbarnav',
  templateUrl: './headerbarnav.component.html',
  styleUrls: ['./headerbarnav.component.css']
})
export class HeaderbarnavComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  login(){
    this.router.navigate(['/login'])
  }

}
