'use strict';
function randomAge(min, max) {
    return Math.floor(Math.random() * (max - min + 1)) + min;
}
let userArr = [];
function User(name, salary) {
    this.name = name;
    this.salary = salary;
    this.age = randomAge(20, 55);
    userArr.push(this);
    console.log(userArr);

}
