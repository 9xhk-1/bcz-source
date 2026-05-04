package androidx.media3.extractor.metadata.flac;

import androidx.annotation.Nullable;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import com.huawei.hms.framework.common.ContainerUtils;
import ho.c;
import ro.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
@Deprecated
/* loaded from: classes2.dex */
public class VorbisComment implements Metadata.Entry {
    public final String key;
    public final String value;

    public VorbisComment(String str, String str2) {
        this.key = c.j(str);
        this.value = str2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            VorbisComment vorbisComment = (VorbisComment) obj;
            if (this.key.equals(vorbisComment.key) && this.value.equals(vorbisComment.value)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.key.hashCode()) * 31) + this.value.hashCode();
    }

    @Override // androidx.media3.common.Metadata.Entry
    public void populateMediaMetadata(MediaMetadata.Builder builder) {
        String str = this.key;
        str.getClass();
        switch (str) {
            case "TOTALTRACKS":
                Integer G = i.G(this.value);
                if (G != null) {
                    builder.setTotalTrackCount(G);
                    break;
                }
                break;
            case "TOTALDISCS":
                Integer G2 = i.G(this.value);
                if (G2 != null) {
                    builder.setTotalDiscCount(G2);
                    break;
                }
                break;
            case "TRACKNUMBER":
                Integer G3 = i.G(this.value);
                if (G3 != null) {
                    builder.setTrackNumber(G3);
                    break;
                }
                break;
            case "ALBUM":
                builder.setAlbumTitle(this.value);
                break;
            case "GENRE":
                builder.setGenre(this.value);
                break;
            case "TITLE":
                builder.setTitle(this.value);
                break;
            case "DESCRIPTION":
                builder.setDescription(this.value);
                break;
            case "DISCNUMBER":
                Integer G4 = i.G(this.value);
                if (G4 != null) {
                    builder.setDiscNumber(G4);
                    break;
                }
                break;
            case "ALBUMARTIST":
                builder.setAlbumArtist(this.value);
                break;
            case "ARTIST":
                builder.setArtist(this.value);
                break;
        }
    }

    public String toString() {
        return "VC: " + this.key + ContainerUtils.KEY_VALUE_DELIMITER + this.value;
    }
}
