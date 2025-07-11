import request from "../axios";

const makeAppointmentAPI = async (data:addAppointmentType) => {
    return request({
        url: '/api/appointment/add',
        method: 'post',
        headers: {"Content-Type":"application/json"},
        data: data
    })
}

export default makeAppointmentAPI;