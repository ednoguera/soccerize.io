package soccerize.io


import grails.rest.RestfulController

import groovy.transform.CompileStatic

@CompileStatic
class TeamController extends RestfulController {
    static responseFormats = ['json', 'xml']
    TeamController() {
        super(Team)
    }

    TeamService teamService

    def search(String q, Integer max) {
        if (q) {
            respond teamService.findByNameLike(
                    "%${q}%".toString(),
                    [max: Math.min( max ?: 10,100 )]
            )
        } else {
            respond([])
        }
    }

//    def save(){
//
//    }
}
