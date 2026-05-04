package androidx.media3.datasource;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class RawResourceDataSource extends BaseDataSource {

    @Deprecated
    public static final String RAW_RESOURCE_SCHEME = "rawresource";
    private final Context applicationContext;

    @Nullable
    private AssetFileDescriptor assetFileDescriptor;
    private long bytesRemaining;

    @Nullable
    private DataSpec dataSpec;

    @Nullable
    private InputStream inputStream;
    private boolean opened;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RawResourceDataSourceException extends DataSourceException {
        @Deprecated
        public RawResourceDataSourceException(String str) {
            super(str, null, 2000);
        }

        @Deprecated
        public RawResourceDataSourceException(Throwable th2) {
            super(th2, 2000);
        }

        public RawResourceDataSourceException(@Nullable String str, @Nullable Throwable th2, int i11) {
            super(str, th2, i11);
        }
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.applicationContext = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i11) {
        return Uri.parse("rawresource:///" + i11);
    }

    private static AssetFileDescriptor openAssetFileDescriptor(Context context, DataSpec dataSpec) throws RawResourceDataSourceException {
        Resources resourcesForApplication;
        int identifier;
        Uri normalizeScheme = dataSpec.uri.normalizeScheme();
        if (TextUtils.equals(RAW_RESOURCE_SCHEME, normalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new RawResourceDataSourceException("rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            identifier = parseResourceId(pathSegments.get(0));
        } else {
            if (!TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
                throw new RawResourceDataSourceException("Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String str = (String) Assertions.checkNotNull(normalizeScheme.getPath());
            if (str.startsWith("/")) {
                str = str.substring(1);
            }
            String packageName = TextUtils.isEmpty(normalizeScheme.getHost()) ? context.getPackageName() : normalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e11) {
                    throw new RawResourceDataSourceException("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e11, 2005);
                }
            }
            if (str.matches("\\d+")) {
                identifier = parseResourceId(str);
            } else {
                identifier = resourcesForApplication.getIdentifier(packageName + ":" + str, "raw", null);
                if (identifier == 0) {
                    throw new RawResourceDataSourceException("Resource not found.", null, 2005);
                }
            }
        }
        try {
            AssetFileDescriptor openRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (openRawResourceFd != null) {
                return openRawResourceFd;
            }
            throw new RawResourceDataSourceException("Resource is compressed: " + normalizeScheme, null, 2000);
        } catch (Resources.NotFoundException e12) {
            throw new RawResourceDataSourceException(null, e12, 2005);
        }
    }

    private static int parseResourceId(String str) throws RawResourceDataSourceException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() throws RawResourceDataSourceException {
        this.dataSpec = null;
        try {
            try {
                InputStream inputStream = this.inputStream;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.inputStream = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.assetFileDescriptor;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e11) {
                        throw new RawResourceDataSourceException(null, e11, 2000);
                    }
                } finally {
                    this.assetFileDescriptor = null;
                    if (this.opened) {
                        this.opened = false;
                        transferEnded();
                    }
                }
            } catch (IOException e12) {
                throw new RawResourceDataSourceException(null, e12, 2000);
            }
        } catch (Throwable th2) {
            this.inputStream = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.assetFileDescriptor;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.assetFileDescriptor = null;
                    if (this.opened) {
                        this.opened = false;
                        transferEnded();
                    }
                    throw th2;
                } catch (IOException e13) {
                    throw new RawResourceDataSourceException(null, e13, 2000);
                }
            } finally {
                this.assetFileDescriptor = null;
                if (this.opened) {
                    this.opened = false;
                    transferEnded();
                }
            }
        }
    }

    @Override // androidx.media3.datasource.DataSource
    @Nullable
    public Uri getUri() {
        DataSpec dataSpec = this.dataSpec;
        if (dataSpec != null) {
            return dataSpec.uri;
        }
        return null;
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) throws RawResourceDataSourceException {
        this.dataSpec = dataSpec;
        transferInitializing(dataSpec);
        AssetFileDescriptor openAssetFileDescriptor = openAssetFileDescriptor(this.applicationContext, dataSpec);
        this.assetFileDescriptor = openAssetFileDescriptor;
        long length = openAssetFileDescriptor.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.assetFileDescriptor.getFileDescriptor());
        this.inputStream = fileInputStream;
        if (length != -1) {
            try {
                if (dataSpec.position > length) {
                    throw new RawResourceDataSourceException(null, null, 2008);
                }
            } catch (RawResourceDataSourceException e11) {
                throw e11;
            } catch (IOException e12) {
                throw new RawResourceDataSourceException(null, e12, 2000);
            }
        }
        long startOffset = this.assetFileDescriptor.getStartOffset();
        long skip = fileInputStream.skip(dataSpec.position + startOffset) - startOffset;
        if (skip != dataSpec.position) {
            throw new RawResourceDataSourceException(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.bytesRemaining = -1L;
            } else {
                long size = channel.size() - channel.position();
                this.bytesRemaining = size;
                if (size < 0) {
                    throw new RawResourceDataSourceException(null, null, 2008);
                }
            }
        } else {
            long j11 = length - skip;
            this.bytesRemaining = j11;
            if (j11 < 0) {
                throw new DataSourceException(2008);
            }
        }
        long j12 = dataSpec.length;
        if (j12 != -1) {
            long j13 = this.bytesRemaining;
            if (j13 != -1) {
                j12 = Math.min(j13, j12);
            }
            this.bytesRemaining = j12;
        }
        this.opened = true;
        transferStarted(dataSpec);
        long j14 = dataSpec.length;
        return j14 != -1 ? j14 : this.bytesRemaining;
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i11, int i12) throws RawResourceDataSourceException {
        if (i12 == 0) {
            return 0;
        }
        long j11 = this.bytesRemaining;
        if (j11 == 0) {
            return -1;
        }
        if (j11 != -1) {
            try {
                i12 = (int) Math.min(j11, i12);
            } catch (IOException e11) {
                throw new RawResourceDataSourceException(null, e11, 2000);
            }
        }
        int read = ((InputStream) Util.castNonNull(this.inputStream)).read(bArr, i11, i12);
        if (read == -1) {
            if (this.bytesRemaining == -1) {
                return -1;
            }
            throw new RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j12 = this.bytesRemaining;
        if (j12 != -1) {
            this.bytesRemaining = j12 - read;
        }
        bytesTransferred(read);
        return read;
    }
}
