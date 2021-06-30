package soccerize.io

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class Player {

    String name
    int age

    Team team

    static constraints = {
        name blank: false
        age min: 16
    }
}
