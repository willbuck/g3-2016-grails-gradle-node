import {Routes} from '@angular/router';
import {IndexComponent} from "./index/index.component";
import {RecordStatComponent} from "./record-stat/record-stat.component";
import {ShowStatComponent} from "./show-stat/show-stat.component";

export const rootRouterConfig: Routes = [
  {path: '', redirectTo: 'index', pathMatch: 'full'},
  {path: 'index', component: IndexComponent},
  {path: 'record', component: RecordStatComponent},
  {path: 'show', component: ShowStatComponent}
];

