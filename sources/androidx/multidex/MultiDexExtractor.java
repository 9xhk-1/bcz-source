package androidx.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import org.junit.jupiter.api.j2;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class MultiDexExtractor implements Closeable {
    private static final int BUFFER_SIZE = 16384;
    private static final String DEX_PREFIX = "classes";
    static final String DEX_SUFFIX = ".dex";
    private static final String EXTRACTED_NAME_EXT = ".classes";
    static final String EXTRACTED_SUFFIX = ".zip";
    private static final String KEY_CRC = "crc";
    private static final String KEY_DEX_CRC = "dex.crc.";
    private static final String KEY_DEX_NUMBER = "dex.number";
    private static final String KEY_DEX_TIME = "dex.time.";
    private static final String KEY_TIME_STAMP = "timestamp";
    private static final String LOCK_FILENAME = "MultiDex.lock";
    private static final int MAX_EXTRACT_ATTEMPTS = 3;
    private static final long NO_VALUE = -1;
    private static final String PREFS_FILE = "multidex.version";
    private static final String TAG = "MultiDex";
    private final FileLock cacheLock;
    private final File dexDir;
    private final FileChannel lockChannel;
    private final RandomAccessFile lockRaf;
    private final File sourceApk;
    private final long sourceCrc;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExtractedDex extends File {
        public long crc;

        public ExtractedDex(File file, String str) {
            super(file, str);
            this.crc = -1L;
        }
    }

    public MultiDexExtractor(File file, File file2) throws IOException {
        Log.i(TAG, "MultiDexExtractor(" + file.getPath() + j2.O + file2.getPath() + j.f81007d);
        this.sourceApk = file;
        this.dexDir = file2;
        this.sourceCrc = getZipCrc(file);
        File file3 = new File(file2, LOCK_FILENAME);
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.lockRaf = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.lockChannel = channel;
            try {
                Log.i(TAG, "Blocking on lock " + file3.getPath());
                this.cacheLock = channel.lock();
                Log.i(TAG, file3.getPath() + " locked");
            } catch (IOException e11) {
                e = e11;
                closeQuietly(this.lockChannel);
                throw e;
            } catch (Error e12) {
                e = e12;
                closeQuietly(this.lockChannel);
                throw e;
            } catch (RuntimeException e13) {
                e = e13;
                closeQuietly(this.lockChannel);
                throw e;
            }
        } catch (IOException e14) {
            e = e14;
            closeQuietly(this.lockRaf);
            throw e;
        } catch (Error e15) {
            e = e15;
            closeQuietly(this.lockRaf);
            throw e;
        } catch (RuntimeException e16) {
            e = e16;
            closeQuietly(this.lockRaf);
            throw e;
        }
    }

    private void clearDexDir() {
        File[] listFiles = this.dexDir.listFiles(new FileFilter() { // from class: androidx.multidex.MultiDexExtractor.1
            @Override // java.io.FileFilter
            public boolean accept(File file) {
                return !file.getName().equals(MultiDexExtractor.LOCK_FILENAME);
            }
        });
        if (listFiles == null) {
            Log.w(TAG, "Failed to list secondary dex dir content (" + this.dexDir.getPath() + ").");
            return;
        }
        for (File file : listFiles) {
            Log.i(TAG, "Trying to delete old file " + file.getPath() + " of size " + file.length());
            if (file.delete()) {
                Log.i(TAG, "Deleted old file " + file.getPath());
            } else {
                Log.w(TAG, "Failed to delete old file " + file.getPath());
            }
        }
    }

    private static void closeQuietly(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e11) {
            Log.w(TAG, "Failed to close resource", e11);
        }
    }

    private static void extract(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException, FileNotFoundException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile("tmp-" + str, EXTRACTED_SUFFIX, file.getParentFile());
        Log.i(TAG, "Extracting " + createTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, read);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!createTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
                }
                Log.i(TAG, "Renaming to " + file.getPath());
                if (createTempFile.renameTo(file)) {
                    closeQuietly(inputStream);
                    createTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            } catch (Throwable th2) {
                zipOutputStream.close();
                throw th2;
            }
        } catch (Throwable th3) {
            closeQuietly(inputStream);
            createTempFile.delete();
            throw th3;
        }
    }

    private static SharedPreferences getMultiDexPreferences(Context context) {
        return context.getSharedPreferences(PREFS_FILE, 4);
    }

    private static long getTimeStamp(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    private static long getZipCrc(File file) throws IOException {
        long zipCrc = ZipUtil.getZipCrc(file);
        return zipCrc == -1 ? zipCrc - 1 : zipCrc;
    }

    private static boolean isModified(Context context, File file, long j11, String str) {
        SharedPreferences multiDexPreferences = getMultiDexPreferences(context);
        if (multiDexPreferences.getLong(str + "timestamp", -1L) != getTimeStamp(file)) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(KEY_CRC);
        return multiDexPreferences.getLong(sb2.toString(), -1L) != j11;
    }

    private List<ExtractedDex> loadExistingExtractions(Context context, String str) throws IOException {
        Log.i(TAG, "loading existing secondary dex files");
        String str2 = this.sourceApk.getName() + EXTRACTED_NAME_EXT;
        SharedPreferences multiDexPreferences = getMultiDexPreferences(context);
        int i11 = multiDexPreferences.getInt(str + KEY_DEX_NUMBER, 1);
        ArrayList arrayList = new ArrayList(i11 + (-1));
        int i12 = 2;
        while (i12 <= i11) {
            ExtractedDex extractedDex = new ExtractedDex(this.dexDir, str2 + i12 + EXTRACTED_SUFFIX);
            if (!extractedDex.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + extractedDex.getPath() + "'");
            }
            extractedDex.crc = getZipCrc(extractedDex);
            long j11 = multiDexPreferences.getLong(str + KEY_DEX_CRC + i12, -1L);
            long j12 = multiDexPreferences.getLong(str + KEY_DEX_TIME + i12, -1L);
            long lastModified = extractedDex.lastModified();
            if (j12 == lastModified) {
                String str3 = str2;
                SharedPreferences sharedPreferences = multiDexPreferences;
                if (j11 == extractedDex.crc) {
                    arrayList.add(extractedDex);
                    i12++;
                    multiDexPreferences = sharedPreferences;
                    str2 = str3;
                }
            }
            throw new IOException("Invalid extracted dex: " + extractedDex + " (key \"" + str + "\"), expected modification time: " + j12 + ", modification time: " + lastModified + ", expected crc: " + j11 + ", file crc: " + extractedDex.crc);
        }
        return arrayList;
    }

    private List<ExtractedDex> performExtractions() throws IOException {
        boolean z11;
        String str = this.sourceApk.getName() + EXTRACTED_NAME_EXT;
        clearDexDir();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.sourceApk);
        try {
            int i11 = 2;
            ZipEntry entry = zipFile.getEntry(DEX_PREFIX + 2 + DEX_SUFFIX);
            while (entry != null) {
                ExtractedDex extractedDex = new ExtractedDex(this.dexDir, str + i11 + EXTRACTED_SUFFIX);
                arrayList.add(extractedDex);
                Log.i(TAG, "Extraction is needed for file " + extractedDex);
                int i12 = 0;
                boolean z12 = false;
                while (i12 < 3 && !z12) {
                    int i13 = i12 + 1;
                    extract(zipFile, entry, extractedDex, str);
                    try {
                        extractedDex.crc = getZipCrc(extractedDex);
                        z11 = true;
                    } catch (IOException e11) {
                        Log.w(TAG, "Failed to read crc from " + extractedDex.getAbsolutePath(), e11);
                        z11 = false;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Extraction ");
                    sb2.append(z11 ? "succeeded" : "failed");
                    sb2.append(" '");
                    sb2.append(extractedDex.getAbsolutePath());
                    sb2.append("': length ");
                    sb2.append(extractedDex.length());
                    sb2.append(" - crc: ");
                    sb2.append(extractedDex.crc);
                    Log.i(TAG, sb2.toString());
                    if (!z11) {
                        extractedDex.delete();
                        if (extractedDex.exists()) {
                            Log.w(TAG, "Failed to delete corrupted secondary dex '" + extractedDex.getPath() + "'");
                        }
                    }
                    z12 = z11;
                    i12 = i13;
                }
                if (!z12) {
                    throw new IOException("Could not create zip file " + extractedDex.getAbsolutePath() + " for secondary dex (" + i11 + j.f81007d);
                }
                i11++;
                entry = zipFile.getEntry(DEX_PREFIX + i11 + DEX_SUFFIX);
            }
            try {
                zipFile.close();
            } catch (IOException e12) {
                Log.w(TAG, "Failed to close resource", e12);
            }
            return arrayList;
        } finally {
        }
    }

    private static void putStoredApkInfo(Context context, String str, long j11, long j12, List<ExtractedDex> list) {
        SharedPreferences.Editor edit = getMultiDexPreferences(context).edit();
        edit.putLong(str + "timestamp", j11);
        edit.putLong(str + KEY_CRC, j12);
        edit.putInt(str + KEY_DEX_NUMBER, list.size() + 1);
        int i11 = 2;
        for (ExtractedDex extractedDex : list) {
            edit.putLong(str + KEY_DEX_CRC + i11, extractedDex.crc);
            edit.putLong(str + KEY_DEX_TIME + i11, extractedDex.lastModified());
            i11++;
        }
        edit.commit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.cacheLock.release();
        this.lockChannel.close();
        this.lockRaf.close();
    }

    public List<? extends File> load(Context context, String str, boolean z11) throws IOException {
        List<ExtractedDex> performExtractions;
        List<ExtractedDex> list;
        Log.i(TAG, "MultiDexExtractor.load(" + this.sourceApk.getPath() + j2.O + z11 + j2.O + str + j.f81007d);
        if (!this.cacheLock.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (!z11 && !isModified(context, this.sourceApk, this.sourceCrc, str)) {
            try {
                list = loadExistingExtractions(context, str);
            } catch (IOException e11) {
                Log.w(TAG, "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e11);
                performExtractions = performExtractions();
                putStoredApkInfo(context, str, getTimeStamp(this.sourceApk), this.sourceCrc, performExtractions);
            }
            Log.i(TAG, "load found " + list.size() + " secondary dex files");
            return list;
        }
        if (z11) {
            Log.i(TAG, "Forced extraction must be performed.");
        } else {
            Log.i(TAG, "Detected that extraction must be performed.");
        }
        performExtractions = performExtractions();
        putStoredApkInfo(context, str, getTimeStamp(this.sourceApk), this.sourceCrc, performExtractions);
        list = performExtractions;
        Log.i(TAG, "load found " + list.size() + " secondary dex files");
        return list;
    }
}
