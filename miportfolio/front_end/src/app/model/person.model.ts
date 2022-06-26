export class person {
    id?: number;
    name: String;
    lastname: String;
    email: String;
    ocupation: String;
    aboutMeDescription: String;
    imageURL: String;

    constructor(name: String, lastname: String, email: String, ocupation: String, aboutMeDescription: String, imageURL: String){
        this.name=name;
        this.lastname=lastname;
        this.email = email;
        this.ocupation=ocupation;
        this.aboutMeDescription=aboutMeDescription;
        this.imageURL=imageURL;
    }
}