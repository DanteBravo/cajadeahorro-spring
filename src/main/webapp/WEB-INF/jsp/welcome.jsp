<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:genericpage>
    <jsp:body>
        <div class="card">
            <div class="card-header">
                Creditos
            </div>
            <div class="card-body">
                <table class="table table-hover">
                    <thead align="center">
                    <tr>
                        <th scope="col">#Credito</th>
                        <th scope="col">Email</th>
                        <th scope="col">Grupo</th>
                        <th scope="col">Fecha de solicitud</th>
                        <th></th>
                    </tr>
                    </thead>
                    <tbody align="center">
                    <tr>
                        <c:forEach items="${credits}" var="credit">
                            <th scope="row">
                                    ${credit.getId()}
                            </th>
                            <td>
                                    ${credit.getUser().getEmail()}
                            </td>
                            <td>
                                    ${credit.getGroup().getDescription()}
                            </td>
                            <td>
                                    ${credit.getCreatedAt()}
                            </td>
                            <td>
                                <a href="${contextPath}/detail/${credit.getId()}" class="btn btn-link">Detalle</a>
                            </td>
                        </c:forEach>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </jsp:body>
</t:genericpage>