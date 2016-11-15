import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { MaterialModule } from '@angular/material';
import { RouterModule } from "@angular/router";
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

import { AppComponent } from './app.component';
import { IndexComponent } from './index/index.component';
import { NavComponent } from './nav/nav.component';
import { NavService} from './nav/nav.service';
import { rootRouterConfig } from './app.routes';
import { RecordStatComponent } from './record-stat/record-stat.component';
import { TournamentService} from './record-stat/tournament.service';
import { ShowStatComponent } from './show-stat/show-stat.component';


@NgModule({
  declarations: [
    AppComponent,
    IndexComponent,
    NavComponent,
    RecordStatComponent,
    ShowStatComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    RouterModule.forRoot(rootRouterConfig),
    NgbModule.forRoot(),
    MaterialModule.forRoot()
  ],
  providers: [NavService, TournamentService],
  bootstrap: [AppComponent]
})
export class AppModule { }
