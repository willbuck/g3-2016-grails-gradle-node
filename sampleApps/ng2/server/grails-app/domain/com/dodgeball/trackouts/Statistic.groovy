package com.dodgeball.trackouts


import grails.rest.*

@Resource(readOnly = false, formats = ['json', 'xml'])
class Statistic {
    Game game

    Player player
    Player opposingPlayer

    StatisticType type

    Date dateCreated
}