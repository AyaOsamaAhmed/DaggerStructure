package com.aya.daggerstructure.school


class GlobalManager {

    // we can't own this class  so can't annotate it with @Inject
    var name : String

    constructor(name : String){
        this.name = name
    }
}