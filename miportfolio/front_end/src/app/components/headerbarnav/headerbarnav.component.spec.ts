import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HeaderbarnavComponent } from './headerbarnav.component';

describe('HeaderbarnavComponent', () => {
  let component: HeaderbarnavComponent;
  let fixture: ComponentFixture<HeaderbarnavComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HeaderbarnavComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(HeaderbarnavComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
