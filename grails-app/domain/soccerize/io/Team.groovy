package soccerize.io

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class Team {
    String name

    static hasMany = [players: Player]

    static constraints = {
        name blank: false, unique: true, size: 0..50
    }
}
