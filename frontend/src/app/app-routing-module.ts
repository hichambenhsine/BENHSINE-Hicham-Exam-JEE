import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

// On laissera vide pour l'instant ou on ajoutera les composants après les avoir générés
const routes: Routes = [
  // { path: 'clients', component: ClientsComponent },
  // { path: 'contrats', component: ContratsComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
