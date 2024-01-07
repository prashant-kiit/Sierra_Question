package Lesson2;

/*
Floozels are a type of Jammers : Jammers -> Floozels
Jammers can have Quizels : Jammers { Quizels[] obj}
Quizels are a type of Klakker : Klakker -> Quizels
Floozels can have several Floozets : Floozels {Floozets[] obj}
*/

class Klakker {}

class Quizels extends Klakker {}

class Jammers {
    Quizels[] quizels = new Quizels[10];
}

class Floozets {}

class Floozels extends Jammers {
    Floozets[] floozets = new Floozets[10];
}
