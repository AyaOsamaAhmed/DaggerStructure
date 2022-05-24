package com.aya.daggerstructure.school


class Teacher {

    // we can't own this class  so can't annotate it with @Inject

     var matrials: Matrials

    constructor(matrials: Matrials){
        this.matrials = matrials

    }



}