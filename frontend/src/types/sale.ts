import { Seller } from './seller';

export type Sale = {
    id: number;
    visited: number;
    deals: number;
    amount: number;
    date: string;
    vendedor: Seller;
}

export type SalePage = {
    content?: Sale[];
    last: boolean;
    totalPages: number;
    totalElements: number;
    size?: number;
    number: number;
    first: boolean;
    numberOfElements?: number;
    empty?: boolean;
}

export type SaleSum = {
    nomeVendedor: string;
    total: number;
}

export type SaleSuccess = {
    nomeVendedor: string;
    visited: number;
    deals: number;
}