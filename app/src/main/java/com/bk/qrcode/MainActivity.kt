package com.bk.qrcode

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.vision.barcode.Barcode
import android.util.SparseArray
import android.widget.Toast

import info.androidhive.barcode.BarcodeReader


class MainActivity : AppCompatActivity(), BarcodeReader.BarcodeReaderListener {
    override fun onCameraPermissionDenied() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onScanned(barcode: Barcode) {
        // single barcode scanned
     //   Toast.makeText(this@MainActivity,barcode.displayValue,Toast.LENGTH_LONG).show()
    }

    override fun onScannedMultiple(list: List<Barcode>) {
        // multiple barcodes scanned
    }

    override fun onBitmapScanned(sparseArray: SparseArray<Barcode>) {
        // barcode scanned from bitmap image
    }

    override fun onScanError(s: String) {
        // scan error
    }
}