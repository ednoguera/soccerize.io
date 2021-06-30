package soccerize.io

import grails.gorm.services.Service

@Service(Team)
interface TeamService {

    List<Team> findByNameLike(String name, Map args)
}
