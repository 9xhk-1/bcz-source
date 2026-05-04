package androidx.compose.ui.text.font;

import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface PlatformFontLoader {
    @l
    Object awaitLoad(@k Font font, @k j00.c<Object> cVar);

    @l
    Object getCacheKey();

    @l
    Object loadBlocking(@k Font font);
}
