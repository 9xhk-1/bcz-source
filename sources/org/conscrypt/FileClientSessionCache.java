package org.conscrypt;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSession;
import org.conscrypt.io.IoUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class FileClientSessionCache {
    public static final int MAX_SIZE = 12;
    private static final Logger logger = Logger.getLogger(FileClientSessionCache.class.getName());
    static final Map<File, Impl> caches = new HashMap();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CacheFile extends File {
        long lastModified;
        final String name;

        public CacheFile(File file, String str) {
            super(file, str);
            this.lastModified = -1L;
            this.name = str;
        }

        @Override // java.io.File
        public long lastModified() {
            long j11 = this.lastModified;
            if (j11 != -1) {
                return j11;
            }
            long lastModified = super.lastModified();
            this.lastModified = lastModified;
            return lastModified;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.Comparable
        public int compareTo(File file) {
            long lastModified = lastModified() - file.lastModified();
            return lastModified == 0 ? super.compareTo(file) : lastModified < 0 ? -1 : 1;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Impl implements SSLClientSessionCache {
        Map<String, File> accessOrder = newAccessOrder();
        final File directory;
        String[] initialFiles;
        int size;

        public Impl(File file) throws IOException {
            boolean exists = file.exists();
            if (exists && !file.isDirectory()) {
                throw new IOException(file + " exists but is not a directory.");
            }
            if (exists) {
                String[] list = file.list();
                this.initialFiles = list;
                if (list == null) {
                    throw new IOException(file + " exists but cannot list contents.");
                }
                Arrays.sort(list);
                this.size = this.initialFiles.length;
            } else {
                if (!file.mkdirs()) {
                    throw new IOException("Creation of " + file + " directory failed.");
                }
                this.size = 0;
            }
            this.directory = file;
        }

        private void delete(File file) {
            if (!file.delete()) {
                IOException iOException = new IOException("FileClientSessionCache: Failed to delete " + file + ".");
                FileClientSessionCache.logger.log(Level.WARNING, iOException.getMessage(), (Throwable) iOException);
            }
            this.size--;
        }

        private static String fileName(String str, int i11) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            return str + "." + i11;
        }

        private void indexFiles() {
            String[] strArr = this.initialFiles;
            if (strArr != null) {
                this.initialFiles = null;
                TreeSet<CacheFile> treeSet = new TreeSet();
                for (String str : strArr) {
                    if (!this.accessOrder.containsKey(str)) {
                        treeSet.add(new CacheFile(this.directory, str));
                    }
                }
                if (treeSet.isEmpty()) {
                    return;
                }
                Map<String, File> newAccessOrder = newAccessOrder();
                for (CacheFile cacheFile : treeSet) {
                    newAccessOrder.put(cacheFile.name, cacheFile);
                }
                newAccessOrder.putAll(this.accessOrder);
                this.accessOrder = newAccessOrder;
            }
        }

        public static void logReadError(String str, File file, Throwable th2) {
            FileClientSessionCache.logger.log(Level.WARNING, "FileClientSessionCache: Error reading session data for " + str + " from " + file + ".", th2);
        }

        public static void logWriteError(String str, File file, Throwable th2) {
            FileClientSessionCache.logger.log(Level.WARNING, "FileClientSessionCache: Error writing session data for " + str + " to " + file + ".", th2);
        }

        private void makeRoom() {
            if (this.size <= 12) {
                return;
            }
            indexFiles();
            int i11 = this.size - 12;
            Iterator<File> it = this.accessOrder.values().iterator();
            do {
                delete(it.next());
                it.remove();
                i11--;
            } while (i11 > 0);
        }

        private static Map<String, File> newAccessOrder() {
            return new LinkedHashMap(12, 0.75f, true);
        }

        @Override // org.conscrypt.SSLClientSessionCache
        public synchronized byte[] getSessionData(String str, int i11) {
            String fileName = fileName(str, i11);
            File file = this.accessOrder.get(fileName);
            if (file == null) {
                String[] strArr = this.initialFiles;
                if (strArr == null) {
                    return null;
                }
                if (Arrays.binarySearch(strArr, fileName) < 0) {
                    return null;
                }
                file = new File(this.directory, fileName);
                this.accessOrder.put(fileName, file);
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[(int) file.length()];
                    new DataInputStream(fileInputStream).readFully(bArr);
                    return bArr;
                } catch (IOException e11) {
                    logReadError(str, file, e11);
                    return null;
                } finally {
                    IoUtils.closeQuietly(fileInputStream);
                }
            } catch (FileNotFoundException e12) {
                logReadError(str, file, e12);
                return null;
            }
        }

        @Override // org.conscrypt.SSLClientSessionCache
        public synchronized void putSessionData(SSLSession sSLSession, byte[] bArr) {
            String peerHost = sSLSession.getPeerHost();
            if (bArr == null) {
                throw new NullPointerException("sessionData == null");
            }
            String fileName = fileName(peerHost, sSLSession.getPeerPort());
            File file = new File(this.directory, fileName);
            boolean exists = file.exists();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                if (!exists) {
                    this.size++;
                    makeRoom();
                }
                try {
                    try {
                        try {
                            fileOutputStream.write(bArr);
                        } catch (IOException e11) {
                            logWriteError(peerHost, file, e11);
                            try {
                                try {
                                    fileOutputStream.close();
                                } finally {
                                }
                            } catch (IOException e12) {
                                logWriteError(peerHost, file, e12);
                            }
                            delete(file);
                        }
                        try {
                            fileOutputStream.close();
                            this.accessOrder.put(fileName, file);
                        } catch (IOException e13) {
                            logWriteError(peerHost, file, e13);
                            delete(file);
                        }
                    } catch (Throwable th2) {
                        try {
                            try {
                                fileOutputStream.close();
                            } finally {
                            }
                        } catch (IOException e14) {
                            logWriteError(peerHost, file, e14);
                        }
                        throw th2;
                    }
                } finally {
                }
            } catch (FileNotFoundException e15) {
                logWriteError(peerHost, file, e15);
            }
        }
    }

    private FileClientSessionCache() {
    }

    public static synchronized void reset() {
        synchronized (FileClientSessionCache.class) {
            caches.clear();
        }
    }

    public static synchronized SSLClientSessionCache usingDirectory(File file) throws IOException {
        Impl impl;
        synchronized (FileClientSessionCache.class) {
            Map<File, Impl> map = caches;
            impl = map.get(file);
            if (impl == null) {
                impl = new Impl(file);
                map.put(file, impl);
            }
        }
        return impl;
    }
}
