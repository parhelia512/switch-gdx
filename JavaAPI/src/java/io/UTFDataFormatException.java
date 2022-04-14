/*
 * Copyright (c) 2012, Codename One and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Codename One designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *  
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 * 
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 * 
 * Please contact Codename One through http://www.codenameone.com/ if you 
 * need additional information or have any questions.
 */

package java.io;
/**
 * Signals that a malformed UTF-8 string has been read in a data input stream or by any class that implements the data input interface. See the writeUTF method for the format in which UTF-8 strings are read and written.
 * Since: JDK1.0, CLDC 1.0 See Also:DataInput, DataInputStream.readUTF(java.io.DataInput), IOException
 */
public class UTFDataFormatException extends java.io.IOException{
    /**
     * Constructs a UTFDataFormatException with null as its error detail message.
     */
    public UTFDataFormatException(){
         //TODO codavaj!!
    }

    /**
     * Constructs a UTFDataFormatException with the specified detail message. The string s can be retrieved later by the
     * method of class java.lang.Throwable.
     * s - the detail message.
     */
    public UTFDataFormatException(java.lang.String s){
         super(s);
    }

}
