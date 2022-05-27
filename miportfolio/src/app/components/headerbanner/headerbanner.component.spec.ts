import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HeaderbannerComponent } from './headerbanner.component';

describe('HeaderbannerComponent', () => {
  let component: HeaderbannerComponent;
  let fixture: ComponentFixture<HeaderbannerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HeaderbannerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(HeaderbannerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
