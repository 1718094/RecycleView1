package com.example.recyclerview;

import android.graphics.drawable.Drawable;

public class Keluarga {
    private String nama, status;
    private Drawable foto;

    public Keluarga(String nama, String status, Drawable foto) {
        this.nama = nama;
        this.status = status;
        this.foto = foto;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public Drawable getFoto() {
        return foto;
    }

    public void setFoto(Drawable foto) {
        this.foto = foto;
    }
}
