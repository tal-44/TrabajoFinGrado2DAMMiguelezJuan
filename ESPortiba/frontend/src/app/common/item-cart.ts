export class ItemCart {
    constructor(public productId: number, public productName: string, public price: number, public quantity: number) {
    }

    getTotalPriceItem() {
        return this.price * this.quantity;
    }
}
