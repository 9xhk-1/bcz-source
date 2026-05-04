package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.a0;
import java.io.IOException;
import java.io.InputStream;
import l60.r0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class g extends a0 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f41852b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f41853c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f41854d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final int f41855e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static final UriMatcher f41856f;

    /* renamed from: a, reason: collision with root package name */
    public final Context f41857a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f41856f = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    public g(Context context) {
        this.f41857a = context;
    }

    private InputStream a(y yVar) throws IOException {
        ContentResolver contentResolver = this.f41857a.getContentResolver();
        Uri uri = yVar.f41978d;
        int match = f41856f.match(uri);
        if (match != 1) {
            if (match != 2) {
                if (match != 3) {
                    if (match != 4) {
                        throw new IllegalStateException("Invalid uri: " + uri);
                    }
                }
            }
            return contentResolver.openInputStream(uri);
        }
        uri = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uri == null) {
            return null;
        }
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    @Override // com.squareup.picasso.a0
    public boolean canHandleRequest(y yVar) {
        Uri uri = yVar.f41978d;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f41856f.match(yVar.f41978d) != -1;
    }

    @Override // com.squareup.picasso.a0
    public a0.a load(y yVar, int i11) throws IOException {
        InputStream a11 = a(yVar);
        if (a11 == null) {
            return null;
        }
        return new a0.a(r0.v(a11), Picasso.LoadedFrom.DISK);
    }
}
