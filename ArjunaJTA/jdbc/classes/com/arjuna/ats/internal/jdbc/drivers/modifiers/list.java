/*
 * JBoss, Home of Professional Open Source
 * Copyright 2006, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU Lesser General Public License, v. 2.1.
 * This program is distributed in the hope that it will be useful, but WITHOUT A
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License,
 * v.2.1 along with this distribution; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA.
 *
 * (C) 2005-2006,
 * @author JBoss Inc.
 */
/*
 * Copyright (C) 2001 - 2004,
 *
 * Arjuna Technologies Limited,
 * Newcastle upon Tyne,
 * Tyne and Wear,
 * UK.
 *
 * $Id: list.java 2342 2006-03-30 13:06:17Z  $
 */

package com.arjuna.ats.internal.jdbc.drivers.modifiers;

public class list
{
    public list ()
    {
		for (String driver : new String[] { "jConnect (TM) for JDBC (TM)",
				"Oracle JDBC driver",
				"IBM DB2 JDBC Universal Driver Architecture",
				"MySQL Connector Java",
				"MySQL-AB JDBC Driver",
				"MariaDB connector/J",
				"H2 JDBC Driver",
				"IBM Data Server Driver for JDBC and SQLJ",
				"Microsoft JDBC Driver 6.4 for SQL Server"}) {
			ModifierFactory.putModifier(driver, -1, -1,
					IsSameRMModifier.class.getName());
		}

		ModifierFactory.putModifier("PostgreSQL Native Driver", -1, -1,
				SupportsMultipleConnectionsModifier.class.getName());
	}
}
