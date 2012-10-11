/*
 * ###
 * Phresco Service
 * 
 * Copyright (C) 1999 - 2012 Photon Infotech Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ###
 */
/*******************************************************************************
 * Copyright (c) 2011 Photon.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Photon Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.photon.in/legal/ppl-v10.html
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * Contributors:
 *     Photon - initial API and implementation
 ******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.05 at 01:31:32 PM IST 
//


package com.photon.phresco.service.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.photon.phresco.service.jaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _DATABASES_QNAME = new QName("http://www.example.org/Phresco", "databases");
    private static final QName _ARCHE_TYPE_INFO_QNAME = new QName("http://www.example.org/Phresco", "archetypeInfo");
    private static final QName _EDITOR_QNAME = new QName("http://www.example.org/Phresco", "editor");
    private static final QName _DOCUMENT_QNAME = new QName("http://www.example.org/Phresco", "document");
    private static final QName _MODULES_QNAME = new QName("http://www.example.org/Phresco", "modules");
    private static final QName _APPTYPE_QNAME = new QName("http://www.example.org/Phresco", "apptype");
    private static final QName _APPTYPES_QNAME = new QName("http://www.example.org/Phresco", "apptypes");
    private static final QName _LIBRARY_QNAME = new QName("http://www.example.org/Phresco", "library");
    private static final QName _DOCUMENTS_QNAME = new QName("http://www.example.org/Phresco", "documents");
    private static final QName _PLATFORM_QNAME = new QName("http://www.example.org/Phresco", "platform");
    private static final QName _LIBRARIES_QNAME = new QName("http://www.example.org/Phresco", "libraries");
    private static final QName _TECHNOLOGY_QNAME = new QName("http://www.example.org/Phresco", "technology");
    private static final QName _MODULE_QNAME = new QName("http://www.example.org/Phresco", "module");
    private static final QName _APPSERVER_QNAME = new QName("http://www.example.org/Phresco", "appserver");
    private static final QName _DATABASE_QNAME = new QName("http://www.example.org/Phresco", "database");
    private static final QName _APPSERVERS_QNAME = new QName("http://www.example.org/Phresco", "appservers");
    private static final QName _EDITORS_QNAME = new QName("http://www.example.org/Phresco", "editors");
    private static final QName _PLATFORMS_QNAME = new QName("http://www.example.org/Phresco", "platforms");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.photon.phresco.service.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Apptype }
     * 
     */
    public Apptype createApptype() {
        return new Apptype();
    }

    /**
     * Create an instance of {@link Appservers }
     * 
     */
    public Appservers createAppservers() {
        return new Appservers();
    }

    /**
     * Create an instance of {@link Modules }
     * 
     */
    public Modules createModules() {
        return new Modules();
    }

    /**
     * Create an instance of {@link Databases }
     * 
     */
    public Databases createDatabases() {
        return new Databases();
    }

    /**
     * Create an instance of {@link Module }
     * 
     */
    public Module createModule() {
        return new Module();
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link Library }
     * 
     */
    public Library createLibrary() {
        return new Library();
    }

    /**
     * Create an instance of {@link Libraries }
     * 
     */
    public Libraries createLibraries() {
        return new Libraries();
    }

    /**
     * Create an instance of {@link Editors }
     * 
     */
    public Editors createEditors() {
        return new Editors();
    }

    /**
     * Create an instance of {@link ArchetypeInfo }
     * 
     */
    public ArchetypeInfo createArchetypeInfo() {
        return new ArchetypeInfo();
    }

    /**
     * Create an instance of {@link Documents }
     * 
     */
    public Documents createDocuments() {
        return new Documents();
    }

    /**
     * Create an instance of {@link Database }
     * 
     */
    public Database createDatabase() {
        return new Database();
    }

    /**
     * Create an instance of {@link Appserver }
     * 
     */
    public Appserver createAppserver() {
        return new Appserver();
    }

    /**
     * Create an instance of {@link Technology }
     * 
     */
    public Technology createTechnology() {
        return new Technology();
    }

    /**
     * Create an instance of {@link Platforms }
     * 
     */
    public Platforms createPlatforms() {
        return new Platforms();
    }

    /**
     * Create an instance of {@link Apptypes }
     * 
     */
    public Apptypes createApptypes() {
        return new Apptypes();
    }

    /**
     * Create an instance of {@link Platform }
     * 
     */
    public Platform createPlatform() {
        return new Platform();
    }

    /**
     * Create an instance of {@link Editor }
     * 
     */
    public Editor createEditor() {
        return new Editor();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Databases }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Phresco", name = "databases")
    public JAXBElement<Databases> createDatabases(Databases value) {
        return new JAXBElement<Databases>(_DATABASES_QNAME, Databases.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArchetypeInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Phresco", name = "archetypeInfo")
    public JAXBElement<ArchetypeInfo> createArchetypeInfo(ArchetypeInfo value) {
        return new JAXBElement<ArchetypeInfo>(_ARCHE_TYPE_INFO_QNAME, ArchetypeInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Editor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Phresco", name = "editor")
    public JAXBElement<Editor> createEditor(Editor value) {
        return new JAXBElement<Editor>(_EDITOR_QNAME, Editor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Phresco", name = "document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<Document>(_DOCUMENT_QNAME, Document.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Modules }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Phresco", name = "modules")
    public JAXBElement<Modules> createModules(Modules value) {
        return new JAXBElement<Modules>(_MODULES_QNAME, Modules.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Apptype }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Phresco", name = "apptype")
    public JAXBElement<Apptype> createApptype(Apptype value) {
        return new JAXBElement<Apptype>(_APPTYPE_QNAME, Apptype.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Apptypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Phresco", name = "apptypes")
    public JAXBElement<Apptypes> createApptypes(Apptypes value) {
        return new JAXBElement<Apptypes>(_APPTYPES_QNAME, Apptypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Library }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Phresco", name = "library")
    public JAXBElement<Library> createLibrary(Library value) {
        return new JAXBElement<Library>(_LIBRARY_QNAME, Library.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Documents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Phresco", name = "documents")
    public JAXBElement<Documents> createDocuments(Documents value) {
        return new JAXBElement<Documents>(_DOCUMENTS_QNAME, Documents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Platform }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Phresco", name = "platform")
    public JAXBElement<Platform> createPlatform(Platform value) {
        return new JAXBElement<Platform>(_PLATFORM_QNAME, Platform.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Libraries }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Phresco", name = "libraries")
    public JAXBElement<Libraries> createLibraries(Libraries value) {
        return new JAXBElement<Libraries>(_LIBRARIES_QNAME, Libraries.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Technology }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Phresco", name = "technology")
    public JAXBElement<Technology> createTechnology(Technology value) {
        return new JAXBElement<Technology>(_TECHNOLOGY_QNAME, Technology.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Module }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Phresco", name = "module")
    public JAXBElement<Module> createModule(Module value) {
        return new JAXBElement<Module>(_MODULE_QNAME, Module.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Appserver }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Phresco", name = "appserver")
    public JAXBElement<Appserver> createAppserver(Appserver value) {
        return new JAXBElement<Appserver>(_APPSERVER_QNAME, Appserver.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Database }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Phresco", name = "database")
    public JAXBElement<Database> createDatabase(Database value) {
        return new JAXBElement<Database>(_DATABASE_QNAME, Database.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Appservers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Phresco", name = "appservers")
    public JAXBElement<Appservers> createAppservers(Appservers value) {
        return new JAXBElement<Appservers>(_APPSERVERS_QNAME, Appservers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Editors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Phresco", name = "editors")
    public JAXBElement<Editors> createEditors(Editors value) {
        return new JAXBElement<Editors>(_EDITORS_QNAME, Editors.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Platforms }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Phresco", name = "platforms")
    public JAXBElement<Platforms> createPlatforms(Platforms value) {
        return new JAXBElement<Platforms>(_PLATFORMS_QNAME, Platforms.class, null, value);
    }

}