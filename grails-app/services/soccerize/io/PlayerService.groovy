package soccerize.io

import grails.gorm.services.Service

@Service(Player)
interface PlayerService {

    List<Player> findByNameLike(String name, Map args)
}
