package po;

import com.google.common.base.Preconditions;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@q
/* loaded from: classes7.dex */
public final class e0 implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f81016a;

    public e0(String patternStr) {
        this(Pattern.compile(patternStr));
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File dir, String fileName) {
        return this.f81016a.matcher(fileName).matches();
    }

    public e0(Pattern pattern) {
        this.f81016a = (Pattern) Preconditions.checkNotNull(pattern);
    }
}
