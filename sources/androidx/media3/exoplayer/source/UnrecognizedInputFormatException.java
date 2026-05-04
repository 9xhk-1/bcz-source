package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.SniffFailure;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public class UnrecognizedInputFormatException extends ParserException {
    public final ImmutableList<SniffFailure> sniffFailures;
    public final Uri uri;

    @uo.l(imports = {"com.google.common.collect.ImmutableList"}, replacement = "this(message, uri, ImmutableList.of())")
    @Deprecated
    public UnrecognizedInputFormatException(String str, Uri uri) {
        this(str, uri, ImmutableList.of());
    }

    public UnrecognizedInputFormatException(String str, Uri uri, List<? extends SniffFailure> list) {
        super(str, null, false, 1);
        this.uri = uri;
        this.sniffFailures = ImmutableList.copyOf((Collection) list);
    }
}
