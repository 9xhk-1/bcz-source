package org.mozilla.javascript.commonjs.module.provider;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import org.mozilla.javascript.Scriptable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface ModuleSourceProvider {
    public static final ModuleSource NOT_MODIFIED = new ModuleSource(null, null, null, null, null);

    ModuleSource loadSource(String str, Scriptable scriptable, Object obj) throws IOException, URISyntaxException;

    ModuleSource loadSource(URI uri, URI uri2, Object obj) throws IOException, URISyntaxException;
}
