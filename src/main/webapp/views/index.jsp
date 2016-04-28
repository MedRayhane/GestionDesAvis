<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE >
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
</head>
<body>
<s:url namespace="/" action="avis" var="lien"></s:url>
<s:a href="%{lien}">Avis</s:a>
</body>
</html>