/*
 * ============================================================================
 * GNU General Public License
 * ============================================================================
 *
 * Copyright (C) 2006-2011 Serotonin Software Technologies Inc. http://serotoninsoftware.com
 * @author Matthew Lohbihler
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.serotonin.bacnet4j.event;

import java.util.logging.Logger;

import com.serotonin.bacnet4j.type.primitive.UnsignedInteger;
import com.serotonin.util.queue.ByteQueue;

public class DefaultExceptionListener implements ExceptionListener {
	private static final Logger log = Logger.getLogger(DefaultExceptionListener.class.getName());
    public void unimplementedVendorService(UnsignedInteger vendorId, UnsignedInteger serviceNumber, ByteQueue queue) {
       log.fine("Received unimplemented vendor service: vendor id=" + vendorId + ", service number="
                + serviceNumber + ", bytes (with context id)=" + queue);
    }

    public void receivedException(Exception e) {
        e.printStackTrace();
    }

    public void receivedThrowable(Throwable t) {
        t.printStackTrace();
    }
}
