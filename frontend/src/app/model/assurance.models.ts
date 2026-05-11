export interface Client {
  id: number;
  nom: string;
  email: string;
}

export interface Contrat {
  id: number;
  dateSouscription: Date;
  statut: string;
  montantCotisation: number;
  type: string;
  matricule?: string;
  marque?: string;
  adresse?: string;
  superficie?: number;
  niveauCouverture?: string;
}
