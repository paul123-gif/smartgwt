/*
 * SmartGWT (GWT for SmartClient)
 * Copyright 2008 and beyond, Isomorphic Software, Inc.
 *
 * SmartGWT is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.  SmartGWT is also
 * available under typical commercial license terms - see
 * http://smartclient.com/license
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */
 
package com.smartgwt.client.widgets.layout.events;

import com.smartgwt.client.event.*;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;

public interface HasSectionHeaderClickHandlers extends HasHandlers {
    /**
     * Notification method fired when the user clicks on a section header.&#010 Returning false will cancel the default behavior (expanding / collapsing the section)&#010
     *
     * @param handler the onSectionHeaderClick handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    HandlerRegistration addSectionHeaderClickHandler(SectionHeaderClickHandler handler);
}
