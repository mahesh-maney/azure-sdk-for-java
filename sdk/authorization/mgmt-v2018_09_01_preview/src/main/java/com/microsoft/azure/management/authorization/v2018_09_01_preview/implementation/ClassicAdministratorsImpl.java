/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * jkl
 */

package com.microsoft.azure.management.authorization.v2018_09_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.authorization.v2018_09_01_preview.ClassicAdministrators;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.arm.utils.PagedListConverter;
import com.microsoft.azure.management.authorization.v2018_09_01_preview.ClassicAdministrator;

class ClassicAdministratorsImpl extends WrapperImpl<ClassicAdministratorsInner> implements ClassicAdministrators {
    private PagedListConverter<ClassicAdministratorInner, ClassicAdministrator> converter;
    private final AuthorizationManager manager;

    ClassicAdministratorsImpl(AuthorizationManager manager) {
        super(manager.inner().classicAdministrators());
        this.manager = manager;
        this.converter = new PagedListConverter<ClassicAdministratorInner, ClassicAdministrator>() {
            @Override
            public Observable<ClassicAdministrator> typeConvertAsync(ClassicAdministratorInner inner) {
                return Observable.just((ClassicAdministrator) wrapModel(inner));
            }
        };
    }

    public AuthorizationManager manager() {
        return this.manager;
    }

    private ClassicAdministratorImpl wrapModel(ClassicAdministratorInner inner) {
        return  new ClassicAdministratorImpl(inner, manager());
    }

    @Override
    public PagedList<ClassicAdministrator> list() {
        ClassicAdministratorsInner client = this.inner();
        return converter.convert(client.list());
    }

    @Override
    public Observable<ClassicAdministrator> listAsync() {
        ClassicAdministratorsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ClassicAdministratorInner>, Iterable<ClassicAdministratorInner>>() {
            @Override
            public Iterable<ClassicAdministratorInner> call(Page<ClassicAdministratorInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ClassicAdministratorInner, ClassicAdministrator>() {
            @Override
            public ClassicAdministrator call(ClassicAdministratorInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
