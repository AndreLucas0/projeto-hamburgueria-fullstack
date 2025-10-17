import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-primary-button',
  standalone: false,
  templateUrl: './primary-button.html',
  styleUrl: './primary-button.css'
})
export class PrimaryButton {

  @Output() onClick = new EventEmitter<any>()

  @Input() action!: () => any;

  handleClick() {
    if(this.action) {
      const result = this.action();
      this.onClick.emit(result);
    } else {
      this.onClick.emit(null);
    }
  }
}
