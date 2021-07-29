<%--Created by IntelliJ IDEA.--%>
<%--User: iU LOVE--%>
<%--Date: 7/28/2021--%>
<%--Time: 11:18 AM--%>
<%--To change this template use File | Settings | File Templates.--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh Sách Khách Hàng</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <style>
        td {
            font-size: 16px;
            font-family: Tahoma;
            text-align: center;
            color: black;
            background-color: white;
        }

        tr {
            background-color: gray;
            color: white;
        }

    </style>
</head>
<body>
<table style="color: blue" ; border="1px">
    <thead>
    <th colspan="7">
        <h1 style="text-align: center">Danh sách khách hàng</h1>
    </th>
    </tr>
    <tr>
        <td width="300px" height="60px"><b>Fullname</b></td>
        <td width="300px" height="60px"><b>Date of birth</b></td>
        <td width="300px" height="60px"><b>Address</b></td>
        <td width="300px" height="60px"><b>Avatar</b></td>
        <td colspan="3" width="300px" height="60px"><b>Function</b></td>


    </tr>
    </thead>
    <c:forEach var="kh" items="${listKH}" varStatus="loop">
        <div class="col-sm-4">
            <tr>
                <td>${kh.name}</td>
                <td>${kh.ngaySinh}</td>
                <td>${kh.diaChi}</td>
                <td><img width="200px" height="100px" src="${kh.img}"></td>
                <td style="width: 100px; height: 100px"><a href="/?action=create" class="btn btn-success">Create</a>
                </td>
                <td style="width: 100px; height: 100px"><a href="/?action=edit&index=${loop.index}"
                                                           class="btn btn-success">Edit</a></td>
                <td style="width: 100px; height: 100px"><a href="/?action=delete&index=${loop.index}"
                                                           class="btn btn-success">Delete</a></td>
            </tr>
        </div>
    </c:forEach>
</table>

</body>
</html>
