// djamaatul anbiya
// dumbways
// run https://es6console.com/kwk75cch/

function printNota(barang) {
    const diskon = 5 / 100; // ubah diskon disini // 5%
    let totalHarga = 0;
    let totalDiskon = 0;
    let totalPembayaran = 0;
    //destructuring array object
    const [{ produk, harga }] = barang;

    console.log('##########################################')
    console.log('Nota Belanja : ');
    //print array barang
    for (let i = 0; i < barang.length; i++) {
        console.log(`${i + 1}.${barang[i].produk} ${barang[i].harga}`);
        totalHarga += barang[i].harga;
    }

    console.log('\nTotal Belanja : ' + totalHarga);
    //jika total harga > 50000 ,diskon 5%
    if (totalHarga >= 50000) {
        totalDiskon = totalHarga * diskon;
    } else {
        totalDiskon = totalHarga * 0;
    }
    
    console.log('Diskon : ' + totalDiskon);
    totalPembayaran = totalHarga - totalDiskon;
    console.log('\nTotal : ' + totalPembayaran);

    console.log('##########################################\n\n\n')

}
printNota([{ produk: 'Telor bebek', harga: 9000 }, { produk: 'Kripik kentang', harga: 14000 }])
printNota([{ produk: 'Baso', harga: 50000 }, { produk: 'Mie Ayam', harga: 10000 }])
