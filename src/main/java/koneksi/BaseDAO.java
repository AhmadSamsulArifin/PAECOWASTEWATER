/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

import java.util.List;

/**
 *
 * @author Ahmad samuel
 */

// * Interface dasar untuk semua Data Access Object (DAO)
// * supaya setiap DAO punya struktur umum (insert, update, delete, get).
// * 
// * Catatan:
// * - Tidak wajib langsung diimplementasikan sekarang.
// * - Bisa dipakai nanti oleh PetugasDAO, AuthDAO, LoginDAO, dll.
// */
public interface BaseDAO<T> {

    // Insert data baru
    int insert(T obj);

    // Update data
    boolean update(T obj);

    // Hapus data berdasarkan ID
    boolean delete(int id);

    // Ambil data berdasarkan ID
    T getById(int id);

    // Ambil semua data (opsional, tambahan umum untuk DAO)
    List<T> getAll();
}
