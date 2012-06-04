﻿//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:2.0.50727.3625
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

[assembly: global::System.Data.Objects.DataClasses.EdmSchemaAttribute()]
[assembly: global::System.Data.Objects.DataClasses.EdmRelationshipAttribute("GlobalPricingModel", "FK_Privileges_Feature", "Feature", global::System.Data.Metadata.Edm.RelationshipMultiplicity.One, typeof(Estee.GPS.DAL.Core.Entities.Feature), "Privileges", global::System.Data.Metadata.Edm.RelationshipMultiplicity.Many, typeof(Estee.GPS.DAL.Core.Entities.Privileges))]
[assembly: global::System.Data.Objects.DataClasses.EdmRelationshipAttribute("GlobalPricingModel", "FK_Privileges_Role", "Role", global::System.Data.Metadata.Edm.RelationshipMultiplicity.One, typeof(Estee.GPS.DAL.Core.Entities.Role), "Privileges", global::System.Data.Metadata.Edm.RelationshipMultiplicity.Many, typeof(Estee.GPS.DAL.Core.Entities.Privileges))]

// Original file name:
// Generation date: 3/6/2012 9:38:59 PM
namespace Estee.GPS.DAL.Core.Entities
{
    
    /// <summary>
    /// There are no comments for GlobalPricingEntities in the schema.
    /// </summary>
    public partial class GlobalPricingEntities : global::System.Data.Objects.ObjectContext
    {
        /// <summary>
        /// Initializes a new GlobalPricingEntities object using the connection string found in the 'GlobalPricingEntities' section of the application configuration file.
        /// </summary>
        public GlobalPricingEntities() : 
                base("name=GlobalPricingEntities", "GlobalPricingEntities")
        {
            this.OnContextCreated();
        }
        /// <summary>
        /// Initialize a new GlobalPricingEntities object.
        /// </summary>
        public GlobalPricingEntities(string connectionString) : 
                base(connectionString, "GlobalPricingEntities")
        {
            this.OnContextCreated();
        }
        /// <summary>
        /// Initialize a new GlobalPricingEntities object.
        /// </summary>
        public GlobalPricingEntities(global::System.Data.EntityClient.EntityConnection connection) : 
                base(connection, "GlobalPricingEntities")
        {
            this.OnContextCreated();
        }
        partial void OnContextCreated();
        /// <summary>
        /// There are no comments for Feature in the schema.
        /// </summary>
        public global::System.Data.Objects.ObjectQuery<Feature> Feature
        {
            get
            {
                if ((this._Feature == null))
                {
                    this._Feature = base.CreateQuery<Feature>("[Feature]");
                }
                return this._Feature;
            }
        }
        private global::System.Data.Objects.ObjectQuery<Feature> _Feature;
        /// <summary>
        /// There are no comments for GPSUser in the schema.
        /// </summary>
        public global::System.Data.Objects.ObjectQuery<GPSUser> GPSUser
        {
            get
            {
                if ((this._GPSUser == null))
                {
                    this._GPSUser = base.CreateQuery<GPSUser>("[GPSUser]");
                }
                return this._GPSUser;
            }
        }
        private global::System.Data.Objects.ObjectQuery<GPSUser> _GPSUser;
        /// <summary>
        /// There are no comments for Privileges in the schema.
        /// </summary>
        public global::System.Data.Objects.ObjectQuery<Privileges> Privileges
        {
            get
            {
                if ((this._Privileges == null))
                {
                    this._Privileges = base.CreateQuery<Privileges>("[Privileges]");
                }
                return this._Privileges;
            }
        }
        private global::System.Data.Objects.ObjectQuery<Privileges> _Privileges;
        /// <summary>
        /// There are no comments for Role in the schema.
        /// </summary>
        public global::System.Data.Objects.ObjectQuery<Role> Role
        {
            get
            {
                if ((this._Role == null))
                {
                    this._Role = base.CreateQuery<Role>("[Role]");
                }
                return this._Role;
            }
        }
        private global::System.Data.Objects.ObjectQuery<Role> _Role;
        /// <summary>
        /// There are no comments for Feature in the schema.
        /// </summary>
        public void AddToFeature(Feature feature)
        {
            base.AddObject("Feature", feature);
        }
        /// <summary>
        /// There are no comments for GPSUser in the schema.
        /// </summary>
        public void AddToGPSUser(GPSUser gPSUser)
        {
            base.AddObject("GPSUser", gPSUser);
        }
        /// <summary>
        /// There are no comments for Privileges in the schema.
        /// </summary>
        public void AddToPrivileges(Privileges privileges)
        {
            base.AddObject("Privileges", privileges);
        }
        /// <summary>
        /// There are no comments for Role in the schema.
        /// </summary>
        public void AddToRole(Role role)
        {
            base.AddObject("Role", role);
        }
        /// <summary>
        /// There are no comments for GlobalPricingModel.GetFeatures in the schema.
        /// </summary>
        public global::System.Data.Objects.ObjectResult<Feature> GetFeatures(string userLoginName)
        {
            global::System.Data.Objects.ObjectParameter userLoginNameParameter;
            if ((userLoginName != null))
            {
                userLoginNameParameter = new global::System.Data.Objects.ObjectParameter("UserLoginName", userLoginName);
            }
            else
            {
                userLoginNameParameter = new global::System.Data.Objects.ObjectParameter("UserLoginName", typeof(string));
            }
            return base.ExecuteFunction<Feature>("GetFeatures", userLoginNameParameter);
        }
    }
    /// <summary>
    /// There are no comments for GlobalPricingModel.Feature in the schema.
    /// </summary>
    /// <KeyProperties>
    /// ID
    /// </KeyProperties>
    [global::System.Data.Objects.DataClasses.EdmEntityTypeAttribute(NamespaceName="GlobalPricingModel", Name="Feature")]
    [global::System.Runtime.Serialization.DataContractAttribute(IsReference=true)]
    [global::System.Serializable()]
    public partial class Feature : global::System.Data.Objects.DataClasses.EntityObject
    {
        /// <summary>
        /// Create a new Feature object.
        /// </summary>
        /// <param name="id">Initial value of ID.</param>
        /// <param name="featureName">Initial value of FeatureName.</param>
        /// <param name="featureType">Initial value of FeatureType.</param>
        /// <param name="orderOfDisplay">Initial value of OrderOfDisplay.</param>
        public static Feature CreateFeature(int id, string featureName, string featureType, int orderOfDisplay)
        {
            Feature feature = new Feature();
            feature.ID = id;
            feature.FeatureName = featureName;
            feature.FeatureType = featureType;
            feature.OrderOfDisplay = orderOfDisplay;
            return feature;
        }
        /// <summary>
        /// There are no comments for Property ID in the schema.
        /// </summary>
        [global::System.Data.Objects.DataClasses.EdmScalarPropertyAttribute(EntityKeyProperty=true, IsNullable=false)]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public int ID
        {
            get
            {
                return this._ID;
            }
            set
            {
                this.OnIDChanging(value);
                this.ReportPropertyChanging("ID");
                this._ID = global::System.Data.Objects.DataClasses.StructuralObject.SetValidValue(value);
                this.ReportPropertyChanged("ID");
                this.OnIDChanged();
            }
        }
        private int _ID;
        partial void OnIDChanging(int value);
        partial void OnIDChanged();
        /// <summary>
        /// There are no comments for Property FeatureName in the schema.
        /// </summary>
        [global::System.Data.Objects.DataClasses.EdmScalarPropertyAttribute(IsNullable=false)]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public string FeatureName
        {
            get
            {
                return this._FeatureName;
            }
            set
            {
                this.OnFeatureNameChanging(value);
                this.ReportPropertyChanging("FeatureName");
                this._FeatureName = global::System.Data.Objects.DataClasses.StructuralObject.SetValidValue(value, false);
                this.ReportPropertyChanged("FeatureName");
                this.OnFeatureNameChanged();
            }
        }
        private string _FeatureName;
        partial void OnFeatureNameChanging(string value);
        partial void OnFeatureNameChanged();
        /// <summary>
        /// There are no comments for Property FeatureType in the schema.
        /// </summary>
        [global::System.Data.Objects.DataClasses.EdmScalarPropertyAttribute(IsNullable=false)]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public string FeatureType
        {
            get
            {
                return this._FeatureType;
            }
            set
            {
                this.OnFeatureTypeChanging(value);
                this.ReportPropertyChanging("FeatureType");
                this._FeatureType = global::System.Data.Objects.DataClasses.StructuralObject.SetValidValue(value, false);
                this.ReportPropertyChanged("FeatureType");
                this.OnFeatureTypeChanged();
            }
        }
        private string _FeatureType;
        partial void OnFeatureTypeChanging(string value);
        partial void OnFeatureTypeChanged();
        /// <summary>
        /// There are no comments for Property OrderOfDisplay in the schema.
        /// </summary>
        [global::System.Data.Objects.DataClasses.EdmScalarPropertyAttribute(IsNullable=false)]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public int OrderOfDisplay
        {
            get
            {
                return this._OrderOfDisplay;
            }
            set
            {
                this.OnOrderOfDisplayChanging(value);
                this.ReportPropertyChanging("OrderOfDisplay");
                this._OrderOfDisplay = global::System.Data.Objects.DataClasses.StructuralObject.SetValidValue(value);
                this.ReportPropertyChanged("OrderOfDisplay");
                this.OnOrderOfDisplayChanged();
            }
        }
        private int _OrderOfDisplay;
        partial void OnOrderOfDisplayChanging(int value);
        partial void OnOrderOfDisplayChanged();
        /// <summary>
        /// There are no comments for Privileges in the schema.
        /// </summary>
        [global::System.Data.Objects.DataClasses.EdmRelationshipNavigationPropertyAttribute("GlobalPricingModel", "FK_Privileges_Feature", "Privileges")]
        [global::System.Xml.Serialization.XmlIgnoreAttribute()]
        [global::System.Xml.Serialization.SoapIgnoreAttribute()]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public global::System.Data.Objects.DataClasses.EntityCollection<Privileges> Privileges
        {
            get
            {
                return ((global::System.Data.Objects.DataClasses.IEntityWithRelationships)(this)).RelationshipManager.GetRelatedCollection<Privileges>("GlobalPricingModel.FK_Privileges_Feature", "Privileges");
            }
            set
            {
                if ((value != null))
                {
                    ((global::System.Data.Objects.DataClasses.IEntityWithRelationships)(this)).RelationshipManager.InitializeRelatedCollection<Privileges>("GlobalPricingModel.FK_Privileges_Feature", "Privileges", value);
                }
            }
        }
    }
    /// <summary>
    /// There are no comments for GlobalPricingModel.GPSUser in the schema.
    /// </summary>
    /// <KeyProperties>
    /// UserLoginID
    /// </KeyProperties>
    [global::System.Data.Objects.DataClasses.EdmEntityTypeAttribute(NamespaceName="GlobalPricingModel", Name="GPSUser")]
    [global::System.Runtime.Serialization.DataContractAttribute(IsReference=true)]
    [global::System.Serializable()]
    public partial class GPSUser : global::System.Data.Objects.DataClasses.EntityObject
    {
        /// <summary>
        /// Create a new GPSUser object.
        /// </summary>
        /// <param name="userLoginID">Initial value of UserLoginID.</param>
        /// <param name="roleID">Initial value of RoleID.</param>
        public static GPSUser CreateGPSUser(string userLoginID, int roleID)
        {
            GPSUser gPSUser = new GPSUser();
            gPSUser.UserLoginID = userLoginID;
            gPSUser.RoleID = roleID;
            return gPSUser;
        }
        /// <summary>
        /// There are no comments for Property UserLoginID in the schema.
        /// </summary>
        [global::System.Data.Objects.DataClasses.EdmScalarPropertyAttribute(EntityKeyProperty=true, IsNullable=false)]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public string UserLoginID
        {
            get
            {
                return this._UserLoginID;
            }
            set
            {
                this.OnUserLoginIDChanging(value);
                this.ReportPropertyChanging("UserLoginID");
                this._UserLoginID = global::System.Data.Objects.DataClasses.StructuralObject.SetValidValue(value, false);
                this.ReportPropertyChanged("UserLoginID");
                this.OnUserLoginIDChanged();
            }
        }
        private string _UserLoginID;
        partial void OnUserLoginIDChanging(string value);
        partial void OnUserLoginIDChanged();
        /// <summary>
        /// There are no comments for Property RoleID in the schema.
        /// </summary>
        [global::System.Data.Objects.DataClasses.EdmScalarPropertyAttribute(IsNullable=false)]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public int RoleID
        {
            get
            {
                return this._RoleID;
            }
            set
            {
                this.OnRoleIDChanging(value);
                this.ReportPropertyChanging("RoleID");
                this._RoleID = global::System.Data.Objects.DataClasses.StructuralObject.SetValidValue(value);
                this.ReportPropertyChanged("RoleID");
                this.OnRoleIDChanged();
            }
        }
        private int _RoleID;
        partial void OnRoleIDChanging(int value);
        partial void OnRoleIDChanged();
    }
    /// <summary>
    /// There are no comments for GlobalPricingModel.Privileges in the schema.
    /// </summary>
    /// <KeyProperties>
    /// ID
    /// </KeyProperties>
    [global::System.Data.Objects.DataClasses.EdmEntityTypeAttribute(NamespaceName="GlobalPricingModel", Name="Privileges")]
    [global::System.Runtime.Serialization.DataContractAttribute(IsReference=true)]
    [global::System.Serializable()]
    public partial class Privileges : global::System.Data.Objects.DataClasses.EntityObject
    {
        /// <summary>
        /// Create a new Privileges object.
        /// </summary>
        /// <param name="id">Initial value of ID.</param>
        public static Privileges CreatePrivileges(int id)
        {
            Privileges privileges = new Privileges();
            privileges.ID = id;
            return privileges;
        }
        /// <summary>
        /// There are no comments for Property ID in the schema.
        /// </summary>
        [global::System.Data.Objects.DataClasses.EdmScalarPropertyAttribute(EntityKeyProperty=true, IsNullable=false)]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public int ID
        {
            get
            {
                return this._ID;
            }
            set
            {
                this.OnIDChanging(value);
                this.ReportPropertyChanging("ID");
                this._ID = global::System.Data.Objects.DataClasses.StructuralObject.SetValidValue(value);
                this.ReportPropertyChanged("ID");
                this.OnIDChanged();
            }
        }
        private int _ID;
        partial void OnIDChanging(int value);
        partial void OnIDChanged();
        /// <summary>
        /// There are no comments for Feature in the schema.
        /// </summary>
        [global::System.Data.Objects.DataClasses.EdmRelationshipNavigationPropertyAttribute("GlobalPricingModel", "FK_Privileges_Feature", "Feature")]
        [global::System.Xml.Serialization.XmlIgnoreAttribute()]
        [global::System.Xml.Serialization.SoapIgnoreAttribute()]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public Feature Feature
        {
            get
            {
                return ((global::System.Data.Objects.DataClasses.IEntityWithRelationships)(this)).RelationshipManager.GetRelatedReference<Feature>("GlobalPricingModel.FK_Privileges_Feature", "Feature").Value;
            }
            set
            {
                ((global::System.Data.Objects.DataClasses.IEntityWithRelationships)(this)).RelationshipManager.GetRelatedReference<Feature>("GlobalPricingModel.FK_Privileges_Feature", "Feature").Value = value;
            }
        }
        /// <summary>
        /// There are no comments for Feature in the schema.
        /// </summary>
        [global::System.ComponentModel.BrowsableAttribute(false)]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public global::System.Data.Objects.DataClasses.EntityReference<Feature> FeatureReference
        {
            get
            {
                return ((global::System.Data.Objects.DataClasses.IEntityWithRelationships)(this)).RelationshipManager.GetRelatedReference<Feature>("GlobalPricingModel.FK_Privileges_Feature", "Feature");
            }
            set
            {
                if ((value != null))
                {
                    ((global::System.Data.Objects.DataClasses.IEntityWithRelationships)(this)).RelationshipManager.InitializeRelatedReference<Feature>("GlobalPricingModel.FK_Privileges_Feature", "Feature", value);
                }
            }
        }
        /// <summary>
        /// There are no comments for Role in the schema.
        /// </summary>
        [global::System.Data.Objects.DataClasses.EdmRelationshipNavigationPropertyAttribute("GlobalPricingModel", "FK_Privileges_Role", "Role")]
        [global::System.Xml.Serialization.XmlIgnoreAttribute()]
        [global::System.Xml.Serialization.SoapIgnoreAttribute()]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public Role Role
        {
            get
            {
                return ((global::System.Data.Objects.DataClasses.IEntityWithRelationships)(this)).RelationshipManager.GetRelatedReference<Role>("GlobalPricingModel.FK_Privileges_Role", "Role").Value;
            }
            set
            {
                ((global::System.Data.Objects.DataClasses.IEntityWithRelationships)(this)).RelationshipManager.GetRelatedReference<Role>("GlobalPricingModel.FK_Privileges_Role", "Role").Value = value;
            }
        }
        /// <summary>
        /// There are no comments for Role in the schema.
        /// </summary>
        [global::System.ComponentModel.BrowsableAttribute(false)]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public global::System.Data.Objects.DataClasses.EntityReference<Role> RoleReference
        {
            get
            {
                return ((global::System.Data.Objects.DataClasses.IEntityWithRelationships)(this)).RelationshipManager.GetRelatedReference<Role>("GlobalPricingModel.FK_Privileges_Role", "Role");
            }
            set
            {
                if ((value != null))
                {
                    ((global::System.Data.Objects.DataClasses.IEntityWithRelationships)(this)).RelationshipManager.InitializeRelatedReference<Role>("GlobalPricingModel.FK_Privileges_Role", "Role", value);
                }
            }
        }
    }
    /// <summary>
    /// There are no comments for GlobalPricingModel.Role in the schema.
    /// </summary>
    /// <KeyProperties>
    /// ID
    /// </KeyProperties>
    [global::System.Data.Objects.DataClasses.EdmEntityTypeAttribute(NamespaceName="GlobalPricingModel", Name="Role")]
    [global::System.Runtime.Serialization.DataContractAttribute(IsReference=true)]
    [global::System.Serializable()]
    public partial class Role : global::System.Data.Objects.DataClasses.EntityObject
    {
        /// <summary>
        /// Create a new Role object.
        /// </summary>
        /// <param name="id">Initial value of ID.</param>
        /// <param name="role1">Initial value of Role1.</param>
        public static Role CreateRole(int id, string role1)
        {
            Role role = new Role();
            role.ID = id;
            role.Role1 = role1;
            return role;
        }
        /// <summary>
        /// There are no comments for Property ID in the schema.
        /// </summary>
        [global::System.Data.Objects.DataClasses.EdmScalarPropertyAttribute(EntityKeyProperty=true, IsNullable=false)]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public int ID
        {
            get
            {
                return this._ID;
            }
            set
            {
                this.OnIDChanging(value);
                this.ReportPropertyChanging("ID");
                this._ID = global::System.Data.Objects.DataClasses.StructuralObject.SetValidValue(value);
                this.ReportPropertyChanged("ID");
                this.OnIDChanged();
            }
        }
        private int _ID;
        partial void OnIDChanging(int value);
        partial void OnIDChanged();
        /// <summary>
        /// There are no comments for Property Role1 in the schema.
        /// </summary>
        [global::System.Data.Objects.DataClasses.EdmScalarPropertyAttribute(IsNullable=false)]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public string Role1
        {
            get
            {
                return this._Role1;
            }
            set
            {
                this.OnRole1Changing(value);
                this.ReportPropertyChanging("Role1");
                this._Role1 = global::System.Data.Objects.DataClasses.StructuralObject.SetValidValue(value, false);
                this.ReportPropertyChanged("Role1");
                this.OnRole1Changed();
            }
        }
        private string _Role1;
        partial void OnRole1Changing(string value);
        partial void OnRole1Changed();
        /// <summary>
        /// There are no comments for Privileges in the schema.
        /// </summary>
        [global::System.Data.Objects.DataClasses.EdmRelationshipNavigationPropertyAttribute("GlobalPricingModel", "FK_Privileges_Role", "Privileges")]
        [global::System.Xml.Serialization.XmlIgnoreAttribute()]
        [global::System.Xml.Serialization.SoapIgnoreAttribute()]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public global::System.Data.Objects.DataClasses.EntityCollection<Privileges> Privileges
        {
            get
            {
                return ((global::System.Data.Objects.DataClasses.IEntityWithRelationships)(this)).RelationshipManager.GetRelatedCollection<Privileges>("GlobalPricingModel.FK_Privileges_Role", "Privileges");
            }
            set
            {
                if ((value != null))
                {
                    ((global::System.Data.Objects.DataClasses.IEntityWithRelationships)(this)).RelationshipManager.InitializeRelatedCollection<Privileges>("GlobalPricingModel.FK_Privileges_Role", "Privileges", value);
                }
            }
        }
    }
}
