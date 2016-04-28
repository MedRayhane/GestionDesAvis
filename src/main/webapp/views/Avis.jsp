<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE >
<html>
<head>
<meta charset="UTF-8">
<title>gestion Des AVIS</title>
<style type ="text/css">
div {
	border: 1px dotted gray;
	padding: 10 px;
	margin: 10px;
}

table {
	border-spacing: 4px;
}

td {
border: 1px dotted gray;
	padding: 5 px;
	color: black;
}

th {
	border: 1px dotted gray;
	padding: 5 px;
	background: maroon;
	color: black;
}</style>
</head>
<body background="<s:url value="/img/fond.jpg"/>">
	<div>
	  <h2><s:text name="Gestion des AVIS"/></h2>
		<s:form action="save" method="post">
			<s:textfield label="Nom " name="avis.nom"></s:textfield>
			<s:textfield label="prenom" name="avis.prenom"></s:textfield>
			<s:textarea name="avis.note" key="NOTE" cols="5" rows="5" />
			<s:textfield label="staut" name="avis.statut"></s:textfield>
			<s:hidden name="editmode"></s:hidden>
			<s:submit value="save"></s:submit>
		</s:form>
	</div>
	<div>
		<table class="table">
			<tr>
				<th>Nom</th>
				<th>prenom</th>
				<th>NOTE</th>
				<th>Statut</th>

			</tr>
			<s:iterator value="aviss">
				<tr>
					<td><s:property value="nom"></s:property></td>
					<td><s:property value="prenom"></s:property></td>
					<td><s:property value="note"></s:property></td>
					<td><s:property value="statut"></s:property></td>

					<s:url namespace="/" action="delete" var="lien1">
						<s:param name="nom">
							<s:property value="nom"></s:property>
						</s:param>
					</s:url>
					<s:url namespace="/" action="edit" var="lien2">
						<s:param name="nom">
							<s:property value="nom"></s:property>
						</s:param>
					</s:url>
					<td><s:a href="%{lien1}">Supprimmer</s:a></td>
					<td><s:a href="%{lien2}">EDIT</s:a></td>
				</tr>
			</s:iterator>
		</table>
	</div>
</body>
</html>