package com.dodgeball.trackouts


import grails.rest.*

import java.time.LocalDateTime

@Resource(readOnly = false, formats = ['json', 'xml'])
class Match {
    // Where
    Tournament tournament
    Court court

    // When
    Date startTime
    Date endTime

    // Who
    Team homeTeam
    Team awayTeam
}