<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>

<t:genericpage>
    <jsp:body>
        <div class="register-container p-3">
            <div class="text-center p-4 mb-4">
                <h1>Detalle</h1>
            </div>
            <div class="d-flex flex-row justify-content-center align-items-center h-100">
                <form:form id="update-user-info"
                           class="w-50"
                           action="${contextPath}/credit/${credit.id}"
                           method="POST">
                    <div class="form-profile-update-info">
                        <fieldset class="scheduler-border">
                            <legend class="scheduler-border">Información personal</legend>
                            <div class="form-group">
                                <input type="text" class="form-control" name="name"
                                       placeholder="Nombre:" autofocus value="${credit.user.name}" disabled>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" name="firstSurname"
                                       placeholder="Apellido:" value="${credit.user.userInfo.firstSurname}" disabled>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control"
                                       name="firstSurname" placeholder="Apellido Materno:"
                                       value="${credit.user.userInfo.secondSurname}" disabled>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" name=""
                                       placeholder="Clave de elector:" value="${credit.user.userInfo.id}" disabled>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control"
                                       name="" placeholder="Telefono:" value="${credit.user.userInfo.phone}" disabled>
                            </div>
                        </fieldset>
                        <fieldset class="scheduler-border">
                            <legend class="scheduler-border">Dirección</legend>
                            <div class="form-group">
                                <input type="text" class="form-control"
                                       name=""
                                       placeholder="Calle:" value="${credit.user.address.street}" disabled>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control"
                                       name="" placeholder="Colonia:" value="${credit.user.address.neighborhod}"
                                       disabled>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control"
                                       name="" placeholder="C.P:" value="${credit.user.address.postcode}" disabled>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control"
                                       name="" placeholder="Municipio:" value="${credit.user.address.municipality}"
                                       disabled>
                            </div>
                        </fieldset>
                        <button class="loading-btn btn btn-blue btn-lg btn-block mt-5" type="submit">
                            <span class="spn-hidden spinner-border spinner-border-sm" role="status" aria-hidden="true"
                                  hidden></span>
                            Aceptar Credito
                        </button>
                    </div>
                </form:form>
            </div>
        </div>
    </jsp:body>
</t:genericpage>