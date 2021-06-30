package soccerize.io


import grails.rest.RestfulController

import groovy.transform.CompileStatic

@CompileStatic
class PlayerController extends RestfulController {
    static responseFormats = ['json', 'xml']
    PlayerController() {
        super(Player)
    }

    PlayerService playerService
    Team team

    def search(String q, Integer max) {
        if (q) {
            respond playerService.findByNameLike(
                    "%${q}%".toString(),
                    [max: Math.min( max ?: 10, 100 )]
            )
        } else {
            respond([])
        }
    }
}
